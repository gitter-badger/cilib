/**
 * Computational Intelligence Library (CIlib)
 * Copyright (C) 2003 - 2010
 * Computational Intelligence Research Group (CIRG@UP)
 * Department of Computer Science
 * University of Pretoria
 * South Africa
 *
 * This library is free software; you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation; either version 3 of the License, or
 * (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this library; if not, see <http://www.gnu.org/licenses/>.
 */
package net.sourceforge.cilib.functions.clustering.clustercenterstrategies;

import java.util.Collection;

import net.sourceforge.cilib.math.Stats;
import net.sourceforge.cilib.problem.dataset.ClusterableDataSet.Pattern;
import net.sourceforge.cilib.type.types.container.Vector;
import net.sourceforge.cilib.util.ClusteringUtils;

/**
 * The <i>center of a cluster</i> is interpreted as the <i>mean of a cluster</i>.
 * @author Theuns Cloete
 */
public class ClusterMeanStrategy implements ClusterCenterStrategy {
    private static final long serialVersionUID = 9080168372118441393L;

    public ClusterMeanStrategy() {
        super();
    }

    /**
     * In this case, we are interested in the mean of the cluster.
     * @param i The integer representing the cluster for which the mean should be returned
     * @return the mean of cluster i
     */
    @Override
    public Vector getCenter(int i) {
        Collection<Pattern> cluster = ClusteringUtils.get().getArrangedClusters().get(i).values();

        return Stats.meanVector(cluster);
    }
}
