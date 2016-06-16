/* Copyright 2006-2007 Graeme Rocher
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.grails.taggable

/**
 * A link class used to link a tag to another entity using the class name and identifier pairing
 *
 * @author Graeme Rocher
 */
class TagLink implements Serializable {

	Tag tag
	String tagRef
	String type

	static constraints = {
		type blank:false
	}

    static mapping = {
        cache 'read-write'
        tag cache:true, fetch:'join'

        table "tag_links"

        autoImport false
    }
}
